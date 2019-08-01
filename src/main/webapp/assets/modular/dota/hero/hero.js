layui.use(['table','admin', 'ax'], function () {
    var $ = layui.$;
    var table = layui.table;
    var $ax = layui.ax;
    var admin = layui.admin;
    /**
     * 系统管理--部门管理
     */
    var Hero = {
        tableId: "heroTable",
    };

    /**
     * 初始化表格的列
     */
    Hero.initColumn = function () {
        return [[
            {type: 'checkbox'},
            {field: 'heroId', hide: true, sort: true, title: 'id'},
            {field: 'cnName', sort: true, title: '中文名称'},
            {field: 'enName', sort: true, title: '英文名称'},
            {field: 'alias', sort: true, title: '玩家简称'},
            {field: 'headImgUrl', sort: true, title: '图片地址'},
            {field: 'echelon', sort: true, title: '梯队'},
            {align: 'center', toolbar: '#tableBar', title: '操作', minWidth: 200}
        ]];
    };
    /**
     * 点击查询按钮
     */
    Hero.search = function () {
        var queryData = {};
        queryData['cnName'] = $("#cnName").val();
        table.reload(Hero.tableId,{where: queryData});
    };
    /**
     * 弹出添加对话框
     */
    Hero.openAddDlg = function () {
        admin.putTempData('formOk', false);
        top.layui.admin.open({
            type: 2,
            title: '添加英雄',
            content: Feng.ctxPath + '/hero/hero_add',
            end: function () {
                admin.getTempData('formOk') && table.reload(Hero.tableId);
            }
        });
    };
    /**
     * 弹出修改对话框
     */
    Hero.openEditDlg = function (data) {
        admin.putTempData('formOk', false);
        top.layui.admin.open({
            type: 2,
            title: '修改英雄',
            content: Feng.ctxPath + '/hero/hero_edit?heroId=' + data.heroId,
            end: function () {
                admin.getTempData('formOk') && table.reload(Hero.tableId);
            }
        });
    };
    /**
     * 渲染表格
     */
        // 渲染表格
    var tableResult = table.render({
            elem: '#' + Hero.tableId,
            url: Feng.ctxPath + '/hero/list',
            page: true,
            height: "full-98",
            cellMinWidth: 100,
            cols: Hero.initColumn()
        });

    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        Hero.search();
    });
    $('#btnAdd').click(function () {

        Hero.openAddDlg();

    });

    // 工具条点击事件
    table.on('tool(' + Hero.tableId + ')', function (obj) {
        var data = obj.data;
        var layEvent = obj.event;

        if (layEvent === 'edit') {
            Hero.openEditDlg(data);
        } else if (layEvent === 'delete') {
            Hero.onDeleteItem(data);
        }
    });


});
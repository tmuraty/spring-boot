# spring-boot
url命名规则:

Rest 风格(用于数据的增删改查)
controller  大模块/小模块
action      功能/CURD/{id}

----增加数据
c  --> Create               增加一条数据
cm --> Create Multiple      增加多条数据

----更新数据
u  --> Update               更新一条数据
um --> Update Multiple      更新多条数据

----读取数据 (没有 rm 读取多条,被拆分了)
r  --> Retrieve             读取一条数据
ra --> Retrieve All         读取所有数据
rp --> Retrieve by Page     读取分页数据
rl --> Retrieve Like        读取模糊数据
       (需要结合 bootstrap-table
        需要参数:total[总条数]limit[每页显示]offset[开始]search[搜索关键字]
        封装到IPage)

----删除数据
d  --> Delete               删除一条数据
dm --> Delete Multiple      删除多条数据

注意:
    1.对于 增加,更新,删除 返回 Globals.JSON_SUCCESS(成功状态)
    2.{id}对于 rp,ra 可能不使用

传统风格(用于页面之间的跳转)
ge --> go to edit           跳转至编辑页面
gs --> go to show           跳转至显示页面
gp --> go to print          跳转至打印页面

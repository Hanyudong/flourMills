/**
 * Created by Administrator on 2017/12/29/029.
 */

//返回上一级页面
function back() {
    window.history.back();
}
let oldpwd = $('#oldpwd');
let newpwd = $('#newpwd');
let checkpwd = $('#checkpwd');
let updateinfo = $('#updateinfo');
//判断原密码与新密码是否相同
oldpwd.change(function () {
    if (oldpwd.val().indexOf(" ") != -1) {
        alert("对不起，密码中不能输入空格");
    }
    if (newpwd.val() == oldpwd.val() && oldpwd.val() !== "" && newpwd.val() !== "") {
        alert("请不要使用最近使用过的密码");
        newpwd.attr("value", "");
    }
});
newpwd.change(function () {
    if (newpwd.val().indexOf(" ") != -1) {
        alert("对不起，密码中不能输入空格");
    }
    if (newpwd.val() == oldpwd.val() && newpwd.val() !== "" && oldpwd.val() !== "") {
        alert("请不要使用最近使用过的密码");
        newpwd.attr("value", "");

        if (checkpwd.val() != newpwd.val() && checkpwd.val() != "" && newpwd.val() !== "") {
            newpwd.attr("value", "");
            alert("抱歉两次密码不相同");
            console.log("执行")
        }
    }
});
//确认密码
checkpwd.change(function () {
    if (checkpwd.val() != newpwd.val() && checkpwd.val() != "" && newpwd.val() !== "") {
        checkpwd.attr("value", "");
        alert("抱歉两次密码不相同");
        console.log("执行")
    }
});

/**
 * Created by Administrator on 2018/1/2/002.
 */


let tel = $("input[type='tel']");
let checkTel = /^((\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$)/;
for(let i=0;i<tel.length;i++){
    tel[i].onchange=function () {
        if(!checkTel.test(tel[i].value)){
            alert("您输入的号码不符合规则");
            tel[i].value = "";
            return false;
        }
    };
}

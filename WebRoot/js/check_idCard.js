/**
 * Created by Administrator on 2018/1/4/004.
 */

let idCard = document.getElementById("idCard");
let checkCard = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
let checkOrg = /[^_IOZSVa-z\W]{2}\d{6}[^_IOZSVa-z\W]{10}$/;

    idCard.onchange=function () {
        if(!checkCard.test(idCard.value)&&!checkOrg.test(idCard.value)){
        	idCard.value = "";
            alert("您输入的号码不符合规则");
            return false;
        }
    };


/**
 * Created by Administrator on 2018/1/2/002.
 */

let percentage = $("#percentage");
let percentageNum;
percentage.change(function () {
    percentageNum = parseFloat(percentage.val());
    if(isNaN(percentageNum)||(percentageNum<0||percentageNum>100)&&(percentage.val()!="")){
        alert("您输入的出粉率不在0--100之间！！");
        percentage.attr("value","");
    }
});
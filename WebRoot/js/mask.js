/**
 * Created by Administrator on 2018/1/3/003.
 */

let date = new Date();
let yy = date.getFullYear();
let mm = (date.getMonth()+1)<10?"0"+(date.getMonth()+1):(date.getMonth()+1);
let dd = (date.getDate())<10?"0"+date.getDate():date.getDate();
let dateString = yy+"-"+mm+"-"+ dd;
let searchcriteria;
let url;

$("input[type='date']").val(dateString);
$("#showUp").click(function () {
    document.getElementById("upDiv").style.display = "block";
});
$("#close").click(function () {
    document.getElementById("upDiv").style.display = "none";
});
$("td").click(function () {
    let that = this.parentNode;
    let thatList = that.childNodes;
    let id = thatList[1].innerHTML;
    let name = thatList[3].innerHTML;
    let address = thatList[5].innerHTML;
    let element = document.createElement("input");
    element.setAttribute("type","text");
    element.setAttribute("value",id)
    element.setAttribute("readonly","readonly");
    $("#showUp").hide();
    document.getElementById("showUp").parentNode.appendChild(element);
    $("#name").attr("value",name);
    $("#address").attr("value",address);
    document.getElementById("upDiv").style.display = "none";
});
$("#search-btn").click(function () {
    //判断查询条件
    searchcriteria = $("input:radio[name='criteria']:checked")
    if(searchcriteria.attr("id") === "uid"){
        url = "?uid=" + $("#criteriaValue").val();
    }else if(searchcriteria.attr("id") === "uname"){
        url = "?uname=" + $("#criteriaValue").val();
    }else{
        alert("请选择查询条件！！");
        return 0;
    }
    if($("criteriaValue").val()===""){
        alert("");
    }

   $.post(
       url,//路径
       function (data,status) {
            alert("ok");
       } 
   );
});
/**
 * Created by Administrator on 2018/1/2/002.
 */
let deleteChecked;
let deletelist = [];

//判断是否选中和是否删除
function deleteUser() {
    deleteChecked = $("input:checked");
    //删除的元素id
    deletelist = deleteList(deleteChecked);
    if(deleteChecked.length !=0){
        flag = confirm("是否删除");
        if(flag){
            window.location = "productTypeAction?method:delProductType=xxx&typeId="+deletelist[0];
        }
    }else{
        alert("抱歉！您未选中数据");
    }
}
//获取要删除的元素数组
function deleteList(deleteChecked) {
    let list = [];
    for (let i=0;i<deleteChecked.length;i++){
        list.push(parseInt(deleteChecked[i].parentNode.parentNode.children[0].innerHTML));
    }
    return list;
}
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>产品销售</title>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="css/bootstrap.min.css" />
  <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
  <link rel="stylesheet" href="css/uniform.css" />
  <link rel="stylesheet" href="css/select2.css" />
  <link rel="stylesheet" href="css/matrix-style.css" />
  <link rel="stylesheet" href="css/matrix-media.css" />
  <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />

  </head>
  
  <body>
      <!--Header-part-->
  <div id="header">
    <h3><a href="index.jsp">大风车管理系统</a></h3>
  </div>
  <!--close-Header-part-->
  <!--top-Header-menu-->
  <div id="user-nav" class="navbar navbar-inverse">
    <ul class="nav">
      <li id="profile-messages"><a title="" href="#"><i class="icon icon-user"></i> <span class="text">欢迎用户</span></a>
      </li>
      <li class=""><a title="" href="login.jsp"><i class="icon icon-share-alt"></i> <span class="text">退出登录</span></a></li>
    </ul>
  </div>
  <!--close-top-Header-menu-->
  <!--sidebar-menu-->
  <div id="sidebar">
    <a href="#" class="visible-phone"><i class="icon icon-home"></i>menu</a>
    <ul>
      <li><a href="index.jsp"><i class="icon icon-home"></i> <span>首页</span></a></li>
      <li class="submenu"><a href="javascript:;"><i class="icon icon-th-list"></i> <span>原粮兑换面粉</span></a>
        <ul>
          <li><a href="warehouse.jsp">原粮入库</a></li>
          <li><a href="face-dusting.jsp">面粉领用</a></li>
          <li><a href="warehouse-treatment.jsp">库存处理</a></li>
        </ul>
      </li>
      <li class="submenu"><a href="#"><i class="icon icon-plane"></i> <span>面粉厂原粮购置</span></a>
        <ul>
          <li><a href="original-purchase.jsp">面粉厂原粮购置</a></li>
        </ul>
      </li>
      <li class="submenu"><a href="#"><i class="icon icon-user-md"></i> <span>面粉厂面粉加工</span></a>
        <ul>
          <li><a href="face-milling.jsp">面粉厂面粉加工</a></li>
        </ul>
      </li>
      <li class="submenu active"><a href="#"><i class="icon icon-shopping-cart"></i> <span>面粉厂产品销售</span></a>
        <ul>
          <li><a href="goods.jsp">面粉厂产品销售</a></li>
        </ul>
      </li>
      <li class="submenu">
        <a href="revenue-check.jsp">
          <i class="icon icon-pencil"></i>
          <span>欠款催收管理</span></a>
        <ul>
          <li><a href="mandatory-management.jsp">欠款催收管理</a></li>
        </ul>
      </li>
      <li class="submenu"><a href="#"><i class="icon icon-file"></i> <span>收入支出流水登记</span></a>
        <ul>
          <li><a href="registration.jsp">收入支出流水登记</a></li>
        </ul>
      </li>
      <li class="submenu"><a href="warehouse-point.jsp"><i class="icon icon-file"></i> <span>面粉产库存清点</span></a>
        <ul>
          <li><a href="warehouse-point.jsp">面粉库存清点</a></li>
        </ul>
      </li>
      <li class="submenu"><a href="#"><i class="icon icon-file"></i> <span>查询凭证报表</span></a>
        <ul>
          <li><a href="input-inspection.jsp">原粮入库查询</a></li>
          <li><a href="dissertative-research.jsp">原粮领用查询</a></li>
          <li><a href="processing-accounting.jsp">面粉加工查询</a></li>
          <li><a href="output-check.jsp">产品出库查询</a></li>
          <li><a href="purchasing-inspection.jsp">原粮购置查询</a></li>
          <li><a href="sales-inquiry.jsp">产品销售查询</a></li>
          <li><a href="revenue-check.jsp">收入/支出查询</a></li>
        </ul>
      </li>
      <li class="submenu"><a href="#"><i class="icon icon-file"></i> <span>系统参数</span></a>
        <ul>
          <li><a href="sys-user-message.jsp">系统用户管理</a></li>
          <li><a href="customer-management.jsp">客户管理</a></li>
          <li><a href="product-type-management.jsp">产品类型管理</a></li>
        </ul>
      </li>
      <li class="submenu"><a href="#"><i class="icon icon-file"></i> <span>凭证打印</span></a>
        <ul>
          <li><a href="document-printing.jsp">凭证打印</a></li>
        </ul>
      </li>
    </ul>
  </div>
  <!--sidebar-menu-->
  <!--main-container-part-->
  <div id="content">
    <div id="content-header">
      <div id="breadcrumb"> <a href="index.jsp" title="回到主页" class="tip-bottom"><i class="icon-home"></i>主页</a> <a href="goods.jsp" class="current">产品销售</a> </div>
      <h1>产品销售</h1>
    </div>

    <div class="container-fluid">
      <hr>
      <div class="row-fluid">
        <div class="span12">
          <div class="widget-box">
            <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
              <h5>校园资讯</h5>
            </div>
            <form action="" method="POST" role="form">
              <div class="form-group">
                <select name="" id="input" class="form-control" required="required">
                  <option value="请选择">--请选择--</option>
                  <option value="用户名">用户名</option>
                  <option value="作者">作者</option>
                  <option value="标题">标题</option>
                </select>
                <input type="text" class="form-control" id="" placeholder="输入查询内容">
                <input type="submit" class="btn btn-primary" value="查询">
              </div>
            </form>
            <div class="widget-content nopadding">
              <table class="table table-bordered data-table">
                <thead>
                  <tr>
                    <th>作者</th>
                    <th>标题</th>
                    <th>内容</th>
                    <th>浏览次数</th>
                    <th>发表时间</th>
                    <th>标签</th>
                    <th>操作</th>
                  </tr>
                </thead>
                <tbody>
                  <tr class="gradeX">
                    <td>俞常爽</td>
                    <td>us后台管理系统搭建</td>
                    <td><strong>今日完成后台管理系统搭建今日完成后台管理系统搭建</strong></td>
                    <td class="center">3</td>
                    <td>2015-10-05 11:51:19</td>
                    <td>八卦</td>
                    <td>
                      <a href="warehouse-treatment.jsp">详情</a>
                      <a href="javascript:;">删除</a>
                    </td>
                  </tr>
                  <tr class="gradeX">
                    <td>俞常爽</td>
                    <td>us后台管理系统搭建</td>
                    <td><strong>今日完成后台管理系统搭建今日完成后台管理系统搭建</strong></td>
                    <td class="center">3</td>
                    <td>2015-10-05 11:51:19</td>
                    <td>八卦</td>
                    <td>
                      <a href="warehouse-treatment.jsp">详情</a>
                      <a href="javascript:;">删除</a>
                    </td>
                  </tr>
                  <tr class="gradeX">
                    <td>yancey</td>
                    <td>us后台管理系统搭建</td>
                    <td><strong>今日完成后台管理系统搭建今日完成后台管理系统搭建</strong></td>
                    <td class="center">4</td>
                    <td>2015-10-05 11:51:19</td>
                    <td>八卦</td>
                    <td>
                      <a href="warehouse-treatment.jsp">详情</a>
                      <a href="javascript:;">删除</a>
                    </td>
                  </tr>
                  <tr class="gradeX">
                    <td>yancey</td>
                    <td>us后台管理系统搭建</td>
                    <td><strong>今日完成后台管理系统搭建今日完成后台管理系统搭建</strong></td>
                    <td class="center">4</td>
                    <td>2015-10-05 11:51:19</td>
                    <td>八卦</td>
                    <td>
                      <a href="warehouse-treatment.jsp">详情</a>
                      <a href="javascript:;">删除</a>
                    </td>
                  </tr>
                  <tr class="gradeX">
                    <td>yancey</td>
                    <td>us后台管理系统搭建</td>
                    <td><strong>今日完成后台管理系统搭建今日完成后台管理系统搭建</strong></td>
                    <td class="center">4</td>
                    <td>2015-10-05 11:51:19</td>
                    <td>八卦</td>
                    <td>
                      <a href="warehouse-treatment.jsp">详情</a>
                      <a href="javascript:;">删除</a>
                    </td>
                  </tr>
                  <tr class="gradeX">
                    <td>yancey</td>
                    <td>us后台管理系统搭建</td>
                    <td><strong>今日完成后台管理系统搭建今日完成后台管理系统搭建</strong></td>
                    <td class="center">4</td>
                    <td>2015-10-05 11:51:19</td>
                    <td>八卦</td>
                    <td>
                      <a href="warehouse-treatment.jsp">详情</a>
                      <a href="javascript:;">删除</a>
                    </td>
                  </tr>
                  <tr class="gradeX">
                    <td>yancey</td>
                    <td>us后台管理系统搭建</td>
                    <td><strong>今日完成后台管理系统搭建今日完成后台管理系统搭建</strong></td>
                    <td class="center">4</td>
                    <td>2015-10-05 11:51:19</td>
                    <td>八卦</td>
                    <td>
                      <a href="warehouse-treatment.jsp">详情</a>
                      <a href="javascript:;">删除</a>
                    </td>
                  </tr>
                  <tr class="gradeX">
                    <td>yancey</td>
                    <td>us后台管理系统搭建</td>
                    <td><strong>今日完成后台管理系统搭建今日完成后台管理系统搭建</strong></td>
                    <td class="center">4</td>
                    <td>2015-10-05 11:51:19</td>
                    <td>八卦</td>
                    <td>
                      <a href="warehouse-treatment.jsp">详情</a>
                      <a href="javascript:;">删除</a>
                    </td>
                  </tr>
                  <tr class="gradeX">
                    <td>yancey</td>
                    <td>us后台管理系统搭建</td>
                    <td><strong>今日完成后台管理系统搭建今日完成后台管理系统搭建</strong></td>
                    <td class="center">4</td>
                    <td>2015-10-05 11:51:19</td>
                    <td>八卦</td>
                    <td>
                      <a href="warehouse-treatment.jsp">详情</a>
                      <a href="javascript:;">删除</a>
                    </td>
                  </tr>
                  <tr class="gradeX">
                    <td>yancey</td>
                    <td>us后台管理系统搭建</td>
                    <td><strong>今日完成后台管理系统搭建今日完成后台管理系统搭建</strong></td>
                    <td class="center">4</td>
                    <td>2015-10-05 11:51:19</td>
                    <td>八卦</td>
                    <td>
                      <a href="warehouse-treatment.jsp">详情</a>
                      <a href="javascript:;">删除</a>
                    </td>
                  </tr>
                </tbody>
              </table>
              <div class="pagination alternate text-center">
                <ul>
                  <li class="disabled"><a href="#">首页</a></li>
                  <li class="active"> <a href="#">上一页</a> </li>
                  <li> <a href="#">2</a> </li>
                  <li><a href="#">2</a></li>
                  <li><a href="#">3</a></li>
                  <li><a href="#">4</a></li>
                  <li><a href="#">下一页</a></li>
                  <li><a href="#">尾页</a></li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!--end-main-container-part-->
  <!--Footer-part-->
  <div class="row-fluid">
    <div id="footer" class="span12"> 2017 &copy; 大风车管理系统. 欢迎致电 <a href="#">00000000000</a> </div>
  </div>
  <!--end-Footer-part-->
  <script src="js/jquery.min.js"></script> 
  <script src="js/jquery.ui.custom.js"></script> 
  <script src="js/bootstrap.min.js"></script> 
  <script src="js/jquery.uniform.js"></script> 
  <script src="js/select2.min.js"></script> 
  <script src="js/matrix.js"></script>
  </body>
</html>

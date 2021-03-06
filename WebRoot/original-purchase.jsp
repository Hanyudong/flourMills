<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>原粮购置</title>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="css/bootstrap.min.css" />
  <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
  <link rel="stylesheet" href="css/matrix-style.css" />
  <link rel="stylesheet" href="css/matrix-media.css" />
  <link rel="stylesheet" href="font-awesome/css/font-awesome.css"/>
  <link rel="stylesheet" href="css/jquery.gritter.css" />

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
      <li class="submenu active"><a href="#"><i class="icon icon-plane"></i> <span>面粉厂原粮购置</span></a>
        <ul>
          <li><a href="original-purchase.jsp">面粉厂原粮购置</a></li>
        </ul>
      </li>
      <li class="submenu"><a href="#"><i class="icon icon-user-md"></i> <span>面粉厂面粉加工</span></a>
        <ul>
          <li><a href="face-milling.jsp">面粉厂面粉加工</a></li>
        </ul>
      </li>
      <li class="submenu"><a href="#"><i class="icon icon-shopping-cart"></i> <span>面粉厂产品销售</span></a>
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
    <!--breadcrumbs面包屑导航-->
    <div id="content-header">
      <div id="breadcrumb">
        <a href="index.jsp" title="返回主页" class="tip-bottom"><i class="icon-home"></i> 主页</a><a href="original-purchase.jsp">原粮购置</a>
      </div>
    </div>
    <!--End-breadcrumbs-->
    <div class="container-fluid">
      <div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-briefcase"></i> </span>
          <h5>Company Name</h5>
        </div>
        <div class="widget-content">
          <div class="row-fluid">
            <div class="span6">
              <table class="table table-bordered table-invoice">
                <tbody>
                  <tr>
                  </tr><tr>
                    <td class="width30">用户名</td>
                    <td class="width70"><strong>张兆军</strong></td>
                  </tr>
                  <tr>
                    <td>权限</td>
                    <td>
                      <form action="" method="POST" role="form" class="form-inline">
                        <div class="form-group">
                          <input name="leave" type="checkbox" value="1" class="form-control check" id="">
                          <label for="">发表留言</label>
                        </div>
                        <div class="form-group">
                          <input name="product" type="checkbox" value="1" class="form-control check" id="">
                          <label for="">发布商品</label>
                        </div>
                        <div class="form-group">
                          <input name="gossip" type="checkbox" value="1" class="form-control check" id="">
                          <label for="">发布校园八卦</label>
                        </div>
                        <div class="form-group">
                          <input name="situation" type="checkbox" value="1" class="form-control check" id="">
                          <label for="">发布校园风云</label>
                        </div>
                        <div class="form-group">
                          <input name="sactivity" type="checkbox" value="1" class="form-control check" id="">
                          <label for="">发布校园活动</label>
                        </div>
                        <div class="form-group">
                          <input name="information" type="checkbox" value="1" class="form-control check" id="">
                          <label for="">发布校园资讯</label>
                        </div>
                        <div class="form-group">
                          <input name="reputation" type="checkbox" value="1" class="form-control check" id="">
                          <label for="">发布口碑商</label>
                        </div>
                        <div class="form-group">
                          <input name="activity" type="checkbox" value="1" class="form-control check" id="">
                          <label for="">发布有活动</label>
                        </div>
                        <div class="form-group">
                          <input name="thenlife" type="checkbox" value="1" class="form-control check" id="">
                          <label for="">发布便生活</label>
                        </div>
                        <input type="submit" class="btn btn-success" value="修改用户权限">
                        <input type="button" value="返回" />
                      </form>
                    </td>
                  </tr>
                </tbody>
              </table>
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

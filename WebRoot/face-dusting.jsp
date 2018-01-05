<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>面粉领用</title>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="css/bootstrap.min.css" />
  <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
  <link rel="stylesheet" href="css/matrix-style.css" />
  <link rel="stylesheet" href="css/matrix-media.css" />
  <link rel="stylesheet" href="css/uniform.css" />
  <link rel="stylesheet" href="font-awesome/css/font-awesome.css" />
  <link rel="stylesheet" href="css/jquery.gritter.css" />
  <link rel="stylesheet" href="css/bootstrap-wysihtml5.css" />
  <style type="text/css">
  @media (min-width: 1200px){
    .row-fluid{
        padding-left: 20px;
    } 
  }
  </style>

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
      <li class="submenu active"><a href="javascript:;"><i class="icon icon-th-list"></i> <span>原粮兑换面粉</span></a>
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
        <a href="index.jsp" title="回到主页" class="tip-bottom"><i class="icon-home"></i>主页</a> 
        <a href="face-dusting.jsp" title="面粉领用" class="tip-bottom" class="current">面粉领用</a>
      </div>
      <h1>面粉领用</h1>
    </div>
    <!--End-breadcrumbs-->
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
            <h5>商品信息修改</h5>
          </div>
          <div class="container">
            <div class="widget-content nopadding span6">
              <form action="#" method="get" class="form-horizontal">
                <div class="control-group">
                  <label class="control-label">文章id :</label>
                  <div class="controls">
                    <input type="text" class="span11" placeholder="名称" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">标题 :</label>
                  <div class="controls">
                    <input type="text" class="span11" placeholder="标题" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">作者 :</label>
                  <div class="controls">
                    <input type="text" class="span11" placeholder="作者" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">发布时间 :</label>
                  <div class="controls">
                    <input type="text" class="span11" placeholder="发布时间" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">浏览次数 :</label>
                  <div class="controls">
                    <input type="text" class="span11" placeholder="浏览次数" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">文章分类</label>
                  <div class="controls">
                    <select >
                      <option>--请选择--</option>
                      <option>校园资讯</option>
                      <option>校园风云</option>
                      <option>校园八卦</option>
                      <option>校园活动</option>
                      <option>口碑商</option>
                      <option>便生活</option>
                      <option>有活动</option>
                    </select>
                    <label class="label">有活动</label>
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">摘要 :</label>
                  <div class="controls">
                    <input type="text" class="span11" placeholder="摘要" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">标签 :</label>
                  <div class="controls">
                    <input type="text" class="span11" placeholder="标签" />
                  </div>
                </div>
                <div class="form-actions">
                  <input type="submit" class="btn btn-success pull-right" value="修改">
                  <input type="submit" class="btn btn-success pull-left" value="返回">
                </div>
              </form>
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
  <script src="js/jquery.peity.min.js"></script>
  </body>
</html>

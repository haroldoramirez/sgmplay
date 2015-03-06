//$(function () {
//        $('.navbar-nav li').click(function () {
//            $(this).siblings().removeClass('active');
//            $(this).addClass('active');
//        });
//});
//$(".nav a").on("click", function(){
//   $(".nav").find(".active").removeClass("active");
//   $(this).parent().addClass("active");
//});
//  $(function () {
//        $('.navbar-nav li').click(function (e) {
//            e.preventDefault();
//            $('.navbar-nav li').removeClass('active');
//            $(this).addClass('active');
//        });
//  });
////$('.menu li a').click(function(e) {
//  var $this = $(this);
//  if (!$this.hasClass('active')) {
//    $this.addClass('active');
//  }
//  e.preventDefault();
//});
//var menu = document.querySelector('.menu');
//var anchors = menu.getElementsByTagName('a');
//
//for (var i = 0; i < anchors.length; i += 1) {
//  anchors[i].addEventListener('click', function() { clickHandler(anchors[i]) }, false);
//}
//
//function clickHandler(anchor) {
//  var hasClass = anchor.getAttribute('class');
//  if (hasClass !== 'active') {
//    anchor.setAttribute('class', 'active');
//  }
//}
//$('.navbar li').click(function(e) {
//    $('.navbar li.active').removeClass('active');
//    var $this = $(this);
//    if (!$this.hasClass('active')) {
//        $this.addClass('active');
//    }
//    e.preventDefault();
//});
//$(function () {
//        $('ul.nav > li').click(function (e) {
//            e.preventDefault();
//            $('ul.nav > li').removeClass('active');
//            $(this).addClass('active');
//        });
//    });
//$(".navbar-nav li").click(function(e) {
//    $(".navbar-nav li").removeClass("active");
//    $(this).addClass("active");
//    e.preventDefault();
//});
//$('.nav.nav-toggle li').click(function(e) {
//  var $this = $(this);
//  $this.siblings().removeClass('active');
//  if (!$this.hasClass('active')) {
//      $this.addClass('active');
//  }
//  e.preventDefault();
//});
$('.slider').slick({
    autoplay: true,       //自動再生
    autoplaySpeed: 2000,  //自動再生のスピード
    speed: 800,           //スライドするスピード
    dots: true,           //スライド下のドット
    arrows: true,         //左右の矢印
    infinite: true,       //永久にループさせる
});



const modal = $('#modal-container');
const img = modal.find('img');

$('img.popup').each(function(index) {
    $(this).click(function() {
        img.attr('src', $(this).attr('src'));
        modal.show();
    })
});

modal.click(function() {
    $(this).hide();
});
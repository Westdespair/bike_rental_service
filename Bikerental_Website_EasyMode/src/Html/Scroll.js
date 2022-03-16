$(function() {
    $('#header-button-1').removeClass('toggled');

    $('#search-icon').click(function(e) {
        e.stopPropagation();
        $('#header-button-1').toggleClass('toggled');
        $("#popup-search").focus();
    });

    $('#header-button-1 input').click(function(e) {
        e.stopPropagation();
    });

    $('#header-button-1, body').click(function() {
        $('#search-menu').removeClass('toggled');
    });
});
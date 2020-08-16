window.onscroll = function () {
    scroll()
};

function scroll() {
    let winScroll = document.body.scrollTop || document.documentElement.scrollTop;
    let height = document.documentElement.scrollHeight - document.documentElement.clientHeight;
    let scrolled = (winScroll / height) * 100;
    document.getElementById("prog-bar").style.width = scrolled + "%";
}
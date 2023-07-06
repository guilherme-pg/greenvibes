const element = document.getElementById('account_manage_display');

document.getElementById('display_account').addEventListener('click', function(event) {
    element.style.display = 'block';
});

document.getElementById('x_close_window').addEventListener('click', function(event) {
    element.style.display = 'none';
});




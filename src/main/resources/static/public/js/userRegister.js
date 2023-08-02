
document.getElementById('user_form').addEventListener('submit', function(event) {

    const inputs = this.querySelectorAll('input[required]');
    let hasEmptyFields = false;

    // Check if there are required inputs
    inputs.forEach(function(input) {
      if (input.value.trim() === '') {
        hasEmptyFields = true;
      }
    });
    // Prevent form submission if there are empty fields
    if (hasEmptyFields) {
      event.preventDefault();
      alert('Please fill in all required fields.');
    }

    // Check if Password and Confirmed Password are the same
    const password = document.getElementById('password_input');
    const confirmed_password = document.getElementById('conf_password_input');

    if (password.value !== confirmed_password.value) {
          event.preventDefault();
          alert('Please confirm the same password.');
        }
 });
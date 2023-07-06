
document.getElementById('user_form').addEventListener('submit', function(event) {

    const inputs = this.querySelectorAll('input[required]');
    let hasEmptyFields = false;

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
 });
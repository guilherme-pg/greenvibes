document.addEventListener("DOMContentLoaded", function() {

    const radioInputs = document.querySelectorAll('input[name="option_account"]');
    const forms = document.querySelectorAll('.account_content');

    radioInputs.forEach(function(radio) {
        radio.addEventListener("change", function() {

            const selectedValue = this.value;

            forms.forEach(function(form) {
                form.classList.add("hidden");
            });

            const selectedForm = document.getElementById(selectedValue);
            selectedForm.classList.remove("hidden");
        });
    });
});
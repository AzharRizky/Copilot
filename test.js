// Create with comments
// Create dropdown menu with three options
function createDropdownMenu() {
    var dropdownMenu = document.createElement("select");
    dropdownMenu.id = "dropdownMenu";
    dropdownMenu.options[0] = new Option("Option 1", "option1");
    dropdownMenu.options[1] = new Option("Option 2", "option2");
    dropdownMenu.options[2] = new Option("Option 3", "option3");
    document.body.appendChild(dropdownMenu);
}

// Create with function
function getDate() {
    var date = new Date();
    return date.getDate();
}
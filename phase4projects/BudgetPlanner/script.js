// Sample data structure to hold deals
let deals = [];

// Function to add a new deal
function addDeal(event) {
    event.preventDefault(); // Prevent form submission

    // Get values from form
    let vendor = document.getElementById('vendor').value;
    let amount = parseFloat(document.getElementById('amount').value);
    let expenseType = document.getElementById('expenseType').value;
    let description = document.getElementById('description').value;

    // Add deal to deals array
    deals.push({ vendor, amount, expenseType, description });

    // Reset form fields
    document.getElementById('vendor').value = '';
    document.getElementById('amount').value = '';
    document.getElementById('description').value = '';

    // Update finance team dashboard
    updateFinanceDashboard();
}

// Function to update finance team dashboard
function updateFinanceDashboard() {
    let totalBudget = deals.reduce((total, deal) => total + deal.amount, 0);
    let expensesList = document.getElementById('expensesList');
    expensesList.innerHTML = ''; // Clear previous list

    // Display each deal
    deals.forEach(deal => {
        let dealItem = document.createElement('div');
        dealItem.innerHTML = `<strong>${deal.vendor}</strong>: $${deal.amount} (${deal.expenseType}) - ${deal.description}`;
        expensesList.appendChild(dealItem);
    });

    // Display total budget
    document.getElementById('totalBudget').textContent = `$${totalBudget}`;
}


// Event listener for deal form submission
document.getElementById('dealForm').addEventListener('submit', addDeal);

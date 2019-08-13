function Item() {
	this.id;
	this.name;
	this.price;
	this.quantity = 1;
	// this.subtotal;
}

let item1 = new Item();
item1.id = 1;
item1.name = "item 1";
item1.price = 10;
// item1.subtotal = item1.price * item1.quantity;

let item2 = new Item();
item2.id = 2;
item2.name = "item 2";
item2.price = 20;
// item2.subtotal = item2.price * item2.quantity;

let item3 = new Item();
item3.id = 3;
item3.name = "item 2";
item3.price = 30;

let item4 = new Item();
item4.id = 4;
item4.name = "item 2";
item4.price = 40;

let item5 = new Item();
item5.id = 5;
item5.name = "item 2";
item5.price = 50;

let item6 = new Item();
item6.id = 6;
item6.name = "item 2";
item6.price = 60;

let item7 = new Item();
item7.id = 7;
item7.name = "item 2";
item7.price = 70;

let item8 = new Item();
item8.id = 80;
item8.name = "item 2";
item8.price = 60;

let item9 = new Item();
item9.id = 9;
item9.name = "item 2";
item9.price = 90;

let item10 = new Item();
item10.id = 10;
item10.name = "item 2";
item10.price = 100;

let items = [item1, item2, item3, item4, item5, item6, item7, item8, item9, item9, item10];
let total = 0;
items.forEach( function(item) {
	let subtotal = item.price*item.quantity;
	total += subtotal;

	tbody.innerHTML += `
		<tr id="itemRow${item.id}">
			<td>${item.id}</td>
			<td>${item.name}</td>
			<td id="price${item.id}">${item.price}</td>
			<td>
				<input 
					class="quantityInput"
					type="number"
					min="1"
					data-id="${item.id}"
					value="${item.quantity}"
				>
			</td>
			<td id="st${item.id}">${subtotal}</td>
			<td>
				<button 
					class="rfcBtn" 
					data-id="${item.id}"
				>
						<i 
							class="rfcBtn fas fa-backspace"
							data-id="${item.id}"
						>
						</i>
				</button>
			</td>
		</tr>
	`; //lagay ka ng class na same "rfcBtn" kay button at kay Icon, pati data-id para kahit sinong mapindot mo sa kanila gagana yung click sa baba
});

tbody.innerHTML += `
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<th>TOTAL</th>
		<th id="totalDisplay">${total}</th>
		<th>
			<button 
				class="emptyCart"
			>
				Empty Cart
			</button>
		<th>
	</tr>
`;

// approach 1: target ALL quantityInput na class, for each -> click

// let qinputs = document.querySelectorAll(".quantityInput"); //si .quantityInput is yung class nung input na box, may . dapat kasi class defined na qinputs siya kasi madami siyang q input
// qinputs.forEach ( function(qinput) { //si q input is yung each na input per row
// 	qinput.addEventListener("change", function(event) {
// 		alert(event.target.value); //target lang natin si value nung input, kasi yun ang target
// 	});
// });

// appraoch 2: target parent, change -> if

tbody.addEventListener("change", function(event) {
	if(event.target.value > 0) {
		let id = event.target.getAttribute("data-id"); //pang target ng specific na id for each of the values inside tbody and trow col
		let quantity = event.target.value; //eto yung value sa loob nung scrollable na input bar
		let price = document.querySelector("#price"+id).innerHTML*1; //presyo to kasi may id naman yung price plus yung data-id niya, basically pang ilan siya

		let subtotal = quantity * price; //nasa loob na kasi eh so wala ng ibang selector, quantity and price na lang
		let previousST = document.querySelector("#st"+id); //eto yung subtotal ng bawat row

		let previousVal = previousST.innerHTML*1;  //eto is para lang maging integer yung string
		previousST.innerHTML = subtotal; //

		totalDisplay.innerHTML = totalDisplay.innerHTML*1 + subtotal - previousVal;
		// let subtotalTDs = document.querySelectorAll(".subtotalTD");
		// total = 0;
		// subtotalTDs.forEach( function(std) {
		// 	total += std.innerHTML*1;
		// });

		// totalDisplay.innerHTML = total;
	}
});

tbody.addEventListener("click", function(event) {
	if(event.target.classList.contains("rfcBtn")) { 
		let id = event.target.getAttribute("data-id"); //data-id to ni button or ni icon kasi nasa loob ka ng event.target which is dapat na cliclick at si button or si icon yun.
		let removeRow = document.querySelector("#itemRow"+id); //ngayon since alam mo na yung number niya, target mo na lang number din ni row
		let previousST = document.querySelector("#st"+id);
		let previousVal = previousST.innerHTML*1;
		removeRow.remove(); //dapat nasa dulo to kasi kapag hindi, na remove niya na bago niya marecognize.
		totalDisplay.innerHTML = totalDisplay.innerHTML*1 - previousVal;
	}	
});

tbody.addEventListener("click", function(event) {
	if(event.target.classList.contains("emptyCart")) { 
		tbody.remove();
	}	
});

let tasks = ["eat", "code", "sleep", "repeat"]

let pendingTasks = document.querySelector("#pendingTasks")
tasks.forEach( function(task) {
	pendingTasks.innerHTML += `
	<li>
		<span>${task}</span>
	<button class="doneBtn">Done</button> 
	</li>`; //done button meron din dapat, kasi meron yung mga initial task, bawal mag comment sa loob kasi literal yung mga nasa loob ng ``,
})

// function doneClick(){
// 	let doneBtns = document.querySelectorAll(".doneBtn"); //pang target ng lahat ng done button seclector all
// 	doneBtns.forEach( function(doneBtn) {
// 		doneBtn.addEventListener("click", function(){
// 			consle.log(doneBtn.parentNode.remove());
// 		}); //for each magagamit mo sa collective na class or kung ano man, basta collective, in this example, collective kasi si doneBtns yung may S, na may doneBtn sa loob
// 	}); //function para lang maiksi, kung andito lang sa taas to, siya lang ma click if nasa loob nung adtaskbtn siya lang ang ma done
// }

// doneClick();
function addTask() {
	if(newTask.value.trim()) {
		pendingTasks.innerHTML += 
		`<li>
			<span>${newTask.value}</span>
			<button class="doneBtn">Done</button> 
		</li>`; //may span to para ma recognize na may previous element sibling si target which is si button, 
		//tapos si span may innerhtml na words para mag append yung mga done tasks na
		//dito sa part na to mag aappend ng bagong task plus yung lumang task, kapag nag loop bago na sila, eh wala naman 
	}
	newTask.value = ""; //pang clear after mag append sa taas, end of loop to, kada matatapos yung pag input nung loop, mag blank
}

pendingTasks.addEventListener("click", function(event) {
	// if(event.target.className == "doneBtn") { //pang target ng event, target mo kasi yung class name na may doneBtn which is yung button mismo
		// //logic here is to remove yung parent node nung target which is si doneBtn ang parent is yung Buong li kaya matanggal whole LI,
		//problema dito ^ (yung mas nasa taas) kapag nag palit ka ng class ng button using CSS kunyari btn btn-danger doneBtn na siya, 3 class na, kailangan mo palitan lahat, eh since nagbigay ka naman
		//ng class na alam mo, target mo na lang yung isang class na yun, si doneBtn yun. you can target that using
	if(event.target.classList.contains("doneBtn")) {
		event.target.parentNode.remove(); 
		doneTasks.innerHTML += 
		`<li>
		<span>${event.target.previousElementSibling.innerHTML}</span>
		<button class="undoneBtn">Undone</button>
		</li>`; //pang target nung innerhtml ng done task na may span. si button si target
		//previous sibling niya si txt sa Li and problem is kailangan element siya, span or div para ma consider na node, kahit ano pa yan basta nasa loob siya, yun kasi ang pang target
		//yung kung ano mang element yun, so ngayon ilalagay siya sa span, kanina walang span yan, dahil nasa span siya kahit langan lahat na ng text na ilagay mo may span.
		//pwede din walang Element, bale previousElementSibling minus Element, so previousSibling lang, mas okay ng may element.
		event.target.parentNode.remove(); //method of dom element, that is treated as an object with many properties and methods
	};
});

doneTasks.addEventListener("click", function(event){
	if(event.target.classList.contains("undoneBtn")){
		event.target.parentNode.remove();
		pendingTasks.innerHTML += 
		`<li>
			<span>${event.target.previousElementSibling.innerHTML}</span>
			<button class="repeatBtn">Repeat</button>
		</li>`
	}
});

repeatedTasks.addEventListener("click", function(event) {
	if(event.target.classList.contains("repeatBtn")) {
		event.target.parentNode.remove(); 
		doneTasks.innerHTML += 
		`<li>
		<span>${event.target.previousElementSibling.innerHTML}</span>
		</li>`; 
	};
});

pendingTasks.addEventListener("click", function(event) {
	if(event.target.classList.contains("repeatBtn")) {
		event.target.parentNode.remove(); 
		repeatedTasks.innerHTML += 
		`<li>
		<span>${event.target.previousElementSibling.innerHTML}</span>
		<button class="doneBtn">Done</button>
		</li>`; 
	};
});

repeatedTasks.addEventListener("click", function(event) {
	if(event.target.classList.contains("doneBtn")) {
		event.target.parentNode.remove(); 
		doneTasks.innerHTML += 
		`<li>
		<span>${event.target.previousElementSibling.innerHTML}</span>
		</li>`; 
	};
});

addTaskBtn.addEventListener("click", function() {
	addTask();
});

newTask.addEventListener("keypress", function(event) {
	if(event.keyCode === 13) {
		addTask();
	}
});

// addTaskBtn.addEventListener("click", function(task) {
// 	pendingTasks.innerHTML += `<li>${newTask.value} <button class="doneBtn">Done</button></li>`; // pang append ng new task from the input bar na may button pag append
// 	newTask.value = reverseString(newTask.value);
// 	// doneClick();
// 	function reverseString(str) {
// 	    return str.split("").reverse().join("");
// 	}
// }); pang reverse lang to haha



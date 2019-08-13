// username, pw, cpw, not empty
//pw == cpw;
//username available
function newUser(){
	let name = username.value //value sa box ni username sa register
	let pword = password.value //valye sa box ni password sa register
	let person = new User(name,pword) //define tayo ng node na person na kayang tumanggap lagi ng bagong User na may name and pword
	console.log(person);
	users.push(person) //push kay users na collection ng user na ginagamit kay for each
	console.log(users);
} 

function User (name, password){ // eto si let person, so si name ni person na value nung username is is name na dito, *check User spelling, si new User sa taas
	//siya na yun user din dito, ngayon si name nung user sa taas at si pword nun == password na dito
	this.username = name; //si name na ang identity ng username ng User na ito
	this.password = password; //si password na ang identity ng password ng User na ito na si New User
}

let user1 = new User();
user1.username = "jcjavid";
user1.password = "password";

let user2 = new User();
user2.username = "eltonjohn";
user2.password = "canyoufeelthelovetonight";

let user3 = new User();
user3.username = "freddieaguilar13";
user3.password = "ibonmangmaylayanglumipad";

let users = [user1, user2, user3]
loginHolder.style.display = "none"

username.addEventListener("blur", function() {
	if (username.value.trim() == "") {
		userWarning.innerHTML = "Username can't be empty";
	} else {
		userWarning.innerHTML = "";
	} 
	users.forEach( function(user){
		if(username.value == user.username){
			userWarning.innerHTML = "Username already exist"
		};
	}); 
		Register()
});

password.addEventListener("blur", function() {
	if (password.value.trim() == "") {
		passwordWarning.innerHTML = "Password can't be empty";
	} else {
		passwordWarning.innerHTML = "";
	}
	users.forEach( function(user){
		if(confirmPw.value != password.value){
			confirmPwWarning.innerHTML = "Password does not match"			
		} else {
			confirmPwWarning.innerHTML = "";
		}
	}); 
		Register()
});

confirmPw.addEventListener("blur", function() {
	if (confirmPw.value.trim() == "") {
		confirmPwWarning.innerHTML = "Please confirm password";
	} else {
		confirmPwWarning.innerHTML = "";
	} 
	users.forEach( function(user){
		if(confirmPw.value != password.value){
			confirmPwWarning.innerHTML = "Password does not match"
		};
	}); 
		Register() //kaya nasa dulo to kasi ang check to if pwede na dumirecho ng register, so check muna dpat lahat
});

function Register(){
	if (
		userWarning.innerHTML != "Username can't be empty" &&
		userWarning.innerHTML != "Username already exist" &&
		passwordWarning.innerHTML != "Password can't be empty" &&
		confirmPwWarning.innerHTML != "Please confirm password" &&	
		confirmPwWarning.innerHTML != "Password does not match" &&
		confirmPw.value != "" &&
		username.value != "" &&
		password.value != ""
		) {
			register.disabled = false;
			// alert(`
			// 	Password Matched
			// 	You may now register ${username.value}
			// 	`)
		} else {
			register.disabled = true;  
		}
};

register.addEventListener("click", function(){
	newUser()//calls the function newUser sa taas na mag save nung nilagay mo sa username.value and password.value, na mag save nung values na yun as new User para masama siya dun sa array ng users na pang for each
	alert(`
		Registration Succesful!
		Welcome ${username.value}
		`)
	username.value = "";
	password.value = "";
	confirmPw.value = ""; //pang reset lang ng field
});

//LOGIN////LOGIN////LOGIN////LOGIN////LOGIN////LOGIN////LOGIN////LOGIN////LOGIN////LOGIN////LOGIN////LOGIN////LOGIN////LOGIN////LOGIN////LOGIN////LOGIN//

loginNow.addEventListener("click", function(){
	registerHolder.style.display = "none"
	loginHolder.style.display = "block"
});

loginUsername.addEventListener("blur", function() {
	if (loginUsername.value.trim() == "") {
		loginUserWarning.innerHTML = "Username can't be empty";
	} else {
		loginUserWarning.innerHTML = "";
	} 
	users.forEach( function(user){
		if(loginUsername.value == user.username){
			loginUserWarning.innerHTML = "";
		};
	}); 
		Login()
});

loginPassword.addEventListener("blur", function() {
	if (loginPassword.value.trim() == "") {
		loginPasswordWarning.innerHTML = "Password can't be empty";
	} else {
		loginPasswordWarning.innerHTML = "";
	} 
	users.forEach( function(user){
		if(loginPassword.value == user.username){
			loginPasswordWarning.innerHTML = "";
		};
	}); 
		Login()
});

function Login(){
	users.forEach( function(user){
		if(loginUsername.value == user.username && loginPassword.value == user.password){
			login.disabled = false;	
		} console.log(loginUsername.value, user.username, loginPassword.value, user.password)
	});
};



//LUMANG COOOOOOOOOOODDDDDEEEEEEEEEEE
// let users = [user1, user2, user3]
// users.forEach( function(user){
// });
// register.addEventListener('click', function (event) {
//   signUpForm.submit();
// });
// password.addEventListener("blur", function() {
// 	if (password.value.trim() == "") {
// 	passwordWarning.innerHTML = "Please provide password";
// 	} else
// 	passwordWarning.style.display = "none";
// });

// confirmPw.addEventListener("blur", function() {
// 	if (confirmPw.value.trim() == "") {
// 	confirmPwWarning.innerHTML = "Kindly confirm password";
// 	} else
// 	confirmPwWarning.style.display = "none";
// });

// username.addEventListener("blur", function() {
// 	let users = [user1, user2, user3]
// 		users.forEach( function(user){
// 		if(username.value == user.username){
// 		userWarning.innerHTML = "nooooooooooopppppeeeeeee"
// 		} ;
// 	});	
// });


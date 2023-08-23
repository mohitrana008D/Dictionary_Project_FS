// searchinput
// searchbtn

const dictionary = (word)=>{
   // const url = 'https://dictionary-by-api-ninjas.p.rapidapi.com/v1/dictionary?word=bright';
const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': 'e264ae8b82msh78a578faf4b1aa1p170822jsn68b6bcef13ad',
		'X-RapidAPI-Host': 'dictionary-by-api-ninjas.p.rapidapi.com'
	}
};

//v=window.localStorage.getItem("myemail")
const name=localStorage.getItem('myname')
document.getElementById('myname').textContent=name;

const email=localStorage.getItem('myemail')
document.getElementById('myemail').textContent=email;

	fetch('https://dictionary-by-api-ninjas.p.rapidapi.com/v1/dictionary?word=' + word, options)
	.then(response => response.json())
	.then((response) => {

        console.log(response);
        wordheading.innerHTML = "Meaning of:" + response.word;
        definition.innerHTML = response.definition.replace("2.", "<br>2.").replace("3.","<br>3.").replace("4.","<br>4.");
        console.log(word, response);
    })
    .catch(err => console.error(err));
}
searchbtn.addEventListener("click", (e)=>{
        e.preventDefault(); 
        dictionary(searchinput.value)
})              

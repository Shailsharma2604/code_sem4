
const btn = document.querySelector("button");
const txt = document.querySelector("p");
btn.addEventListener("click",updateBtn);
function updateBtn(){
    if (btn.textContent === "Start machine"){
        btn.textContent="stop machine";
        txt.textContent="The machine has started!";
    }   else{
        btn.textContent = "stop machine";
        txt.textContent = "the machine is stopped.";
    }

    
}

document.getElementById("buttonSubmit").addEventListener("click",function(){
    const fromDate ={
        memID:document.getElementById("memID").value,
        title:document.getElementById("title").value,
        content:document.getElementById("content").value,
        writer:document.getElementById("title"),
    }


const csrfToken = document.querySelector("mata[name='_csrf']").getAttribute("content");
const csrfHeader = document.querySelector("mata[name='_csrf_header']").getAttribute("content");

fetch("/menu/add",{
    method:"POST",
    headers:{
        'Content-Type':'application/json',
        [csrfHeader]:csrfToken
    },
    body:JSON.stringify(formData)
}).then(response=>{
    if(!response.ok){
        throw new Error("공지사항 작성실패")
    }
    return response.text();
}).then(_=>{
    console.log("success");
    window.location.href="/";
    //localhost:8080으로 이동됩니다.
}).catch(error=>{
    console.log("에러가 발생",error);
})

})
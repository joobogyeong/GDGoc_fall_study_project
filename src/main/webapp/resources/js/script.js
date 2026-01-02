const container = document.getElementById("container");
const menuAdmin = document.getElementById("menuAdin");
const menuList = document.getElementById("menuList");

const csrfToken = document.querySelector("mata[name='_csrf']").getAttribute("content");
const csrfHeader = document.querySelector("mata[name='_csrf_header']").getAttribute("content");

function fetchMenus(){
    fetch("/menu/all").then(response=>response.json())
        .then(menus => {
            console.log(menus);
            menuList.innerHTML=``;
            menus.forEach(menu=>{
                const menuItem = document.createElement('div');
                menuItem.className = 'menu-itme';
                menuItem.innerHTML = `
                <a href="#" class="menu-link" style="text-decoration:none; color:black;"></a>
                <h3>${menu.title}</h3>
                <p>${menu.content}</p>
                <small>작성자:${menu .writer},작성인:${menu.indate},조회수:${menu.count}</small>
                <br/>
                <br/>
                `;
                //계시글을 클릭할때
                menuItem.querySelector(".menu-link").addEventListener('click',(event)=>{
                    event.preventDefault();
                    console.log(`event:${event}`)

                    incrementCount(menu.idx).then(()=>window.location.href=`/noticeCheckPage?idx=${menu.idx}`)
                })
                menuList.appendChild(menuItem);
            })
        })
}
function incrementCount(idx){
    return fetch(`/menu/count/`+idx,{
        method: 'PUT',
        headers:{
            [csrfHeader]:csrfToken
        }
    }).then(response=>{
        if(!response.ok){
            console.log("데이터가 안넘어감");
        }
    }).catch(error=>{
        console.error(`Error: ${error}`);
    })
}
window.addEventListener('load',fetchMenus);
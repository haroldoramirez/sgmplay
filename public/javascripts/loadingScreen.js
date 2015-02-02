
function openLoadingScreen() {

    var div = document.createElement("div");
    window.__load.div = div;
    div.style.position = "fixed";
    div.style.top = "0px";
    div.style.left = "0px";
    div.style.zIndex = "2147483647";
    div.style.right = "0px";
    div.style.bottom = "0px";
    div.style.backgroundColor = "rgba(14,53,69,0.5)";
    
    var table = document.createElement("table"),
    tr = document.createElement("tr"),
    td = document.createElement("td");
    
    td.innerHTML = "Carregando...";
    td.style.color = "#fff";
    td.style.fontFamily = "Arial";
    td.style.fontSize = "30px";

    div.appendChild(table);
    table.appendChild(tr);
    tr.appendChild(td);
    
    table.style.height = "100%";
    table.style.marginLeft = "auto";
    table.style.marginRight = "auto";
    
    document.body.appendChild(div);
}

function closeLoadingScreen() {
    window.__load.div.remove();
}

window.__load = {
    counter: 0,
    ini: function(){
        if(this.counter==0)openLoadingScreen();
        this.counter ++;
    },
    end: function(){
        this.counter --;
        if(this.counter==0)closeLoadingScreen();
    },
};

var bk = XMLHttpRequest.prototype.send;
XMLHttpRequest.prototype.send = function(a,b,c,d,e,f,g,h,i,j,k){
    window.__load.ini();
    var self = this;
    self.bk = bk;
    var s, s2, p;
    for(att in self)
        if(typeof self[att] == "function" && att.substring(0,2)=="on"){
            self[att+"bk"] = self[att];
            eval("self[att] = function(){"
            +    "window.__load.end();"
            +    "this."+att+"bk();"
            +"}");
        }
    self.bk(a,b,c,d,e,f,g,h,i,j,k);
}
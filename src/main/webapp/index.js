loadBrandList();

function loadBrandList() {
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let brandDataList = JSON.parse(this.responseText);
            let brandList = ' <table style="width:100%"> <tr><th> #  </th> <th>   img   </th><th>   img discription </th></tr>   '  ;

            //brandDataList.reverse();

            for (let index = 0; index < brandDataList.length; index++) {
                brandList +=

                    '<tr><td> ' + index + '</td> <td> ' + '<img src='+ brandDataList[index].file + ' style="width:100px;height:75px;"></img>' +
                    '</td><td> ' + brandDataList[index].name
                    + '</td></tr> ' ;

            }
            brandList += "</table> ";
            document.getElementById("root").innerHTML = brandList;
        }
    };
    xhttp.open("GET", "http://localhost:8080/PicTest/api/test/list", true);
    xhttp.send();
}
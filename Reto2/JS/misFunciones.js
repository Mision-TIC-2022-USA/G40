function traerInformacion() {
    $.ajax({
        url: "https://ge98c0cd4db3cd7-db202110141836.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/usuario/usuario",
        type: 'GET',
        dataType: 'json',
        success: function (json) {
            CrearTabla(json.items);
        },
        error: function (xhr, status) {
            console.log('ha sucedido un problema');
        },
        complete: function (xhr, status) {
            //console.log('Petición realizada');
        }
    });
}

function CrearTabla(datos) {

    var datostabla = "";

    for (const dato of datos) {
        datostabla += "<tr>";
        datostabla += "<td>" + dato.id + "</td>";
        datostabla += "<td>" + dato.nombre + "</td>";
        datostabla += "<td>" + dato.cedula + "</td>";
        datostabla += "<td>" + dato.celular + "</td>";
        datostabla += "<td>"+"<button onclick='EliminarRegistro("+ dato.id +")'>Eliminar!</button>"+"</td>";
        datostabla += "</tr>";
    }

    $("#mytable").html(datostabla);
}

function GuardarRegistro() {

    var registro =
    {
        id: $("#id").val(),
        nombre: $("#nombre").val(),
        cedula: $("#cedula").val(),
        celular: $("#celular").val()
    }

    $.ajax({
        url: "https://ge98c0cd4db3cd7-db202110141836.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/usuario/usuario",
        type: 'POST',
        //dataType: 'json',
        data: JSON.stringify(registro),
        contentType: "application/json",
        success: function (json) {
            traerInformacion();
            $("#id").val("");
            $("#nombre").val("");
            $("#cedula").val("");
            $("#celular").val("");
        },
        error: function (xhr, status) {
            console.log(status);
        },
        complete: function (xhr, status) {
            //console.log('Petición realizada');
        }
    });
}

function EliminarRegistro(idRegistro) {
    var registro =
    {
        id: idRegistro,
    }

    $.ajax({
        url: "https://ge98c0cd4db3cd7-db202110141836.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/usuario/usuario",
        type: 'DELETE',
        dataType: 'json',
        data: JSON.stringify(registro),
        contentType: "application/json",
        success: function (json) {
            traerInformacion();
        },
        error: function (xhr, status) {
            console.log(status);
        },
        complete: function (xhr, status) {
            //console.log('Petición realizada');
        }
    });
}

function ActualizarRegistro() {
    var registro =
    {
        id: $("#id").val(),
        nombre: $("#nombre").val(),
        cedula: $("#cedula").val(),
        celular: $("#celular").val()
    }

    $.ajax({
        url: "https://ge98c0cd4db3cd7-db202110141836.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/usuario/usuario",
        type: 'PUT',
        //dataType: 'json',
        data: JSON.stringify(registro),
        contentType: "application/json",
        success: function (json) {
            traerInformacion();
        },
        error: function (xhr, status) {
            console.log(status);
        },
        complete: function (xhr, status) {
            //console.log('Petición realizada');
        }
    });
}


function to_Gister() {
    $(".login").animate({opacity: '0'}, "slow");
    $(".login").css("display", "none");
    $(".register").css("display", "block");
    $(".register").animate({opacity: '1'}, "slow")
}

function to_Login() {
    $(".register").animate({opacity: '0'}, "slow");
    $(".register").css("display", "none");
    $(".login").css("display", "block");
    $(".login").animate({opacity: '1'}, "slow")
}

function check() {
    if ($("#r_Username").val() == "") {
        $(".erro_3").text("ÓÃ»§Ãû²»ÄÜÎª¿Õ");
        return false;
    }//ï¿½Ã»ï¿½ï¿½ï¿½ï¿½Ð¿ï¿½

    if ($("#r_Psw").val().length > 18 || $("#r_Psw").val().length < 6) {
        $(".erro_4").text("ÇëÊäÈë6~18Î»ÃÜÂë");
        return false;
    }//6~18Î»ÃÜÂë

    if ($("#r_Psw").val() == "") {
        $(".erro_4").text("ÃÜÂë²»ÄÜÎª¿Õ");
        return false;
    }//ï¿½ï¿½ï¿½ï¿½Îªï¿½ï¿½


    else if ($("#r_Psw").val() != $("#r_Psw2").val()) {
        $(".erro_4").text("ÄãÊäÈëµÄÁ½´ÎÃÜÂë²»Ò»ÖÂ");
    }//ï¿½ï¿½ï¿½ë²»Îªï¿½Õ¡ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ë²»ï¿½ï¿½Í¬

    return true;
}

function login() {
	var userName = $('#username').val()
	var password = $("#psw").val()

    var user = {
        "id": 0,
        "password": password,
        "userName": userName
    }

    $.ajax({
        type: "POST",
        url: "/users/login",
        contentType: "application/json",
        data : JSON.stringify(user),
        success:function(data) {
            if (data.state == 0) {
                window.location.href = "/html/index.html"
            } else {
                alert(data.message)
            }
        }
    });
}


function register() {
    console.log("register")
    if (!check()) {
        return
    }

    var userName = $('#r_Username').val()
    var password = $("#r_Psw").val()

    var user = {
        "id": 0,
        "password": password,
        "userName": userName
    }

    console.log(user)

    $.ajax({
        type: "POST",
        url: "/users/",
        contentType: "application/json",
        data : JSON.stringify(user),
        dataType : 'json',
        success:function(data) {
            console.log(data)
            if (data.state == 0) {
                location.reload();

            }else {
                alert(data.message)
            }
        }
    });
}

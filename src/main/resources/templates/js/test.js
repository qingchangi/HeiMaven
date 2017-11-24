/**
 * Created by 你 楠哥 。 on 2017/11/24.
 */
window.onload = test2();

function  test(name,age) {
    this.name = name;
    this.age = age;
    this.showSelf = function () {
        alert(this.name+":"+this.age);
    }
}

function test1() {
    new test("宋文迪",10).showSelf();
}

function test2() {
    Date.prototype.setHello = function () {
        alert("asdd");
    }

    var date = new Date();
    date.setHello();
}
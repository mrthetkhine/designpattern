var obj1 = {
    fly : function()
    {
        console.log('I am bird');
    }
}
var obj2 = {
    fly : function()
    {
        console.log('I am aeroplane');
    }
}

var obj = obj1;
obj.fly();

obj = obj2;
obj.fly();
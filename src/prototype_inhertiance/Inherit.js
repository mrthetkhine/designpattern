function Base()
{
    this.baseData = [];
    this.hello = function()
    {
        console.log('Base.hello');
    }
}
function Base2()
{
    this.baseData = [];
    this.hello = function()
    {
        console.log('Base2.hello');
    }
}
function Child()
{
    this.childData = "Child Data";
    
}
Child.prototype = new Base();
var child1 = new Child();
var child2 = new Child();

child1.baseData.push("C1");
child1.childData = "C1";

child2.baseData.push("C2");
child2.childData = "C2";

console.log('Child1 base data ',child1.baseData);
console.log('Child2 base data ',child2.baseData);

console.log('Child 1 child data ',child1.childData);
console.log('Child 2 child data ',child2.childData);

child1.hello();
Child.prototype = new Base2();
var child3 = new Child();
child3.hello();
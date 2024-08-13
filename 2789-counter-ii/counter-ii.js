/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    var pcount=init;
    function increment(){
      return ++pcount
    }
    function reset(){
        return pcount=init
    }
    function decrement(){
        return --pcount;
    }
    return{increment,reset,decrement}
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */
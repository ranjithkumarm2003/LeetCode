/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
   return {
    toBe:(v1)=>{
        if(v1===val)return true;
        else throw new Error("Not Equal")
    },
    notToBe:(v1)=>{
        if(v1===val)throw new Error("Equal")
        else return true
    }
   }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */
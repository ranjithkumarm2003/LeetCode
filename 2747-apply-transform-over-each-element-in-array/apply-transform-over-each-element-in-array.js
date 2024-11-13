/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    
  for(let x=0;x<arr.length;x++){
    arr[x]=fn(arr[x],x);
  }
return arr;
};
function sumOfDigits(num){
    let sum = [];
    for(let index = 0; index < num; index++){
        sum.push(index);
        console.log(sum);
    }
    return sum;
}

let result = sumOfDigits([7631]);
console.log(result);
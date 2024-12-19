function solution(numbers) {
      let arr = [0,1,2,3,4,5,6,7,8,9];
    
      let sum = arr.reduce((a,b)=> {
          if(!numbers.includes(b)){
              return a + b;
          }
          return a;
      },0)
      return sum;
    }

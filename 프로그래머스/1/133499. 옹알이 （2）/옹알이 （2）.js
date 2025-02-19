function solution(babbling) {
  let cnt = 0;
  let valid = ['aya', 'ye', 'woo', 'ma'];
  for (let i = 0; i < babbling.length; i++) {
    let a = babbling[i];
    let isValid = true;

    for (let j = 0; j < valid.length; j++) {
      if (a.includes(valid[j].repeat(2))) {
        isValid = false;
        break;
      }
    }
    if (isValid) {
      for (let j = 0; j < valid.length; j++) {
        a = a.split(valid[j]).join(' ');
      }
      if (a.trim() === '') {
        cnt++;
      }
    }
  }
  return cnt;
}

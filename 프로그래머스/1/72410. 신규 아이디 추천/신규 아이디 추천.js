function solution(new_id) {
    new_id = new_id.toLowerCase();
    new_id = new_id.replace(/[^a-z0-9-_.]/g, '');
    new_id = new_id.replace(/\.{2,}/g,'.');
    new_id = new_id.replace(/^\.|\.$/g,'');
    if(new_id==='')new_id='a';
    
    if(new_id.length >= 16){
        new_id = new_id.substring(0, 15);
        new_id = new_id.replace(/\.$/, '');
    }
    while(new_id.length <=2){
        new_id += new_id.charAt(new_id.length -1);
    }
    return new_id;
}
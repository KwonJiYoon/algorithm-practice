function solution(s) {
    
    var numbers = s.split(' ');
    
    var min = Math.min(...numbers);
    var max = Math.max(...numbers);

    
    
    return min + ' ' + max;
}
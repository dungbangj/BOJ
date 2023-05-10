import * as fs from 'fs';

const inputNum : number = parseInt(fs.readFileSync('/dev/stdin', 'utf-8'));

console.log(String.fromCharCode(44031 + inputNum));
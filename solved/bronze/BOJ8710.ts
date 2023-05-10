import * as fs from 'fs';

const input: string = fs.readFileSync('/dev/stdin', 'utf-8').trim();

const[k, w, m]: number[] = input.split(' ').map(Number);

let count = 0;
let currentHeight = k;

while (currentHeight < w)
{
    count++;
    currentHeight += m;
}
console.log(count);
import * as fs from 'fs';

const input: number = fs.readFileSync('/dev/stdin', 'utf-8').trim().split('\n').map(Number)[0];

for (let i = 1; i <= input; i++)
    console.log("Hello World, Judge " + i + "!");
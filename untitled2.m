truthTable = dec2bin(0:7) - '0'; 
truthTable = flip(truthTable, 2); 
p = truthTable(:, 1);
q = truthTable(:, 2);
r = truthTable(:, 3);
fprintf(' p   q   r\n');
fprintf('-----------\n');
for i = 1:length(p)
    fprintf(' %d   %d   %d\n', p(i), q(i), r(i));
end

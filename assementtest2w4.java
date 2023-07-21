import java.util.*;
class primenumber {
static int prime(int b) {
int j,cnt;
cnt=1;
for (j = 2; j <= b/2; j++) {
if(b%j==0)
cnt=0;
}
if(cnt==0)
return 1;
else
return 0;
}


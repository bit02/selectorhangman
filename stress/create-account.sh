
#!/usr/bin/env bash
#Create Payer, Payee, Fee, Tax and Settlement Account
#To support additional features and transactions, create more accounts
GREEN='\033[0;32m'
NC='\033[0m' # No Color
echo -e "${GREEN}Creating Payer Account${NC}"
curl -X POST \
  http://localhost:3003/transaction/event \
  -H 'Content-Type: application/json' \
  -d '{
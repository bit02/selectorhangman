#!/usr/bin/env bash
#Pay from payer to payee account at a rate of 100/s to try to break the system
GREEN='\033[0;32m'
NC='\033[0m' # No Color
echo -e "${GREEN}P2P USD 100 from Payer to Payee, for 5,000 times at a rate of 1000/s${NC}"
echo "POST http://localhost:3003/transaction/event
Content-Type: application/json
@./p2p-request
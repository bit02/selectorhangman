# client-ledger-service: a REST endpoint for accepting and generating mutation events

## What does it do

client-ledger-service is part 1 of the 3 parts of a simple ledger demo over event-sourcing, using commoditized software and simple set up

## Quick start

### Step 1

Go to stress test folder
```
cd stress
```

Run Kafka (Assuming you are running on Mac, and you have already installed Apache Kafka). 

*The script uses default config which has only 1 partition. Make sure you config to at least the number of consumers (say 3).*
```
sudo ./kafka.sh
```

### Step 2

Run the 
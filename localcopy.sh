#!/bin/bash

# If this script has a permission denied error, run chmod +x localcopy.sh
echo "Developed by Rachit Jaiswal - 2023"
sleep 2
echo "Updating the GAVE repository on the localhost. Please make sure you are running this script from the source of your project, or in this case, the GAVE-backend folder. (cd ___/____/____/GAVE-backend/)"
echo -n "Are you ready [PRESS ENTER TO CONTINUE]"
read hello
echo "----------------------------------------------------------------------------------------------------------------"
# cd /root/ww3-backend/
docker-compose down
git pull .
./mvnw clean
docker-compose up -d --build
echo "----------------------------------------------------------------------------------------------------------------"
echo "Update Complete."
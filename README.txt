
For Deployment Only;;

📦 3. Package for Deployment
On Windows PowerShell or Git Bash:

tar -czvf snapcart_deploy_package.tar.gz Dockerfile deploy.sh docker-compose.yml pom.xml snapcart_ui src


cd D:\01_Project\snapcart\snapcart
tar -czvf snapcart_deploy_package.tar.gz .\Dockerfile .\deploy.sh .\pom.xml .\snapcart_ui .\src .\target


Now copy the snapcart_deploy_package.tar.gz to your AWS machine via:

scp snapcart_deploy_package.tar.gz ubuntu@<your-ec2-ip>:/home/ubuntu/




=========================================
🟢 4. On AWS (Linux EC2)


# SSH into your instance
ssh ubuntu@<your-ec2-ip>

# Extract and deploy
tar -xvzf snapcart_deploy_package.tar.gz
cd snapcart
chmod +x deploy.sh
./deploy.sh

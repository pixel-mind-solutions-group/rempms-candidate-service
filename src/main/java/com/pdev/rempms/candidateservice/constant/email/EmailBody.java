package com.pdev.rempms.candidateservice.constant.email;

public class EmailBody {
    public static final String CANDIDATE_REGISTERED_BODY = """
            <html>
              <body style="font-family: Arial, sans-serif; line-height: 1.6; color: #333; background-color: #f4f6f8; padding: 20px;">
                <div style="max-width: 600px; margin: auto; background: #ffffff; padding: 30px; border-radius: 10px; box-shadow: 0 4px 12px rgba(0,0,0,0.08);">
            
                  <h2 style="color:#1F75FE; text-align:center;">Welcome to PIXEL HIRE 🎉</h2>
                  <p>Hi <b>%s</b>,</p>
            
                  <p>We’re thrilled to let you know that your <b>PIXEL HIRE</b> account has been successfully registered!</p>
                  <p>Your unique candidate number is <b style="color:#1F75FE;">%s</b>.</p>
                  <p>You can now log in, explore job opportunities, and manage your career journey with us.</p>
            
                  <p style="margin-top:25px;">Thank you for joining PIXEL HIRE — we’re excited to have you onboard!</p>
            
                  <br>
                  <p>Warm regards,<br><b>The PIXEL HIRE Team</b></p>
                  <hr style="border: none; border-top: 1px solid #ddd; margin-top: 30px;">
                  <small style="color:gray;">This is an automated message — please do not reply to this email.</small>
                </div>
              </body>
            </html>
            """;
}
